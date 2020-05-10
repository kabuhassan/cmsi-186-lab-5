import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class PodRace {
    public static Set<Pod> race(double distance, Set<Pod> racers, double timeSlice, double timeLimit) {
        
        if((distance <= 0) || (timeSlice <= 0)){
            throw new IllegalArgumentException("the distance or the precision cannot be less than or equal to 0");
        }

        if(racers.size() <= 1){
            return racers;
        }
        Set<Pod> result = new HashSet<Pod>();
        double t = timeSlice;
        int Slices = 1;
        while(t < timeLimit){
            for (Pod pod : racers){
                if (pod.distanceTraveled(0, t, Slices) > distance){
                    result.add(pod);
                } 
            }
            if(!result.isEmpty()){
                return result;
            }
            t += timeSlice;
            Slices += 1;
        }

        return result;
    }
}
