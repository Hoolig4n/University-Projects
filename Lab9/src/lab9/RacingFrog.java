package lab9;

public class RacingFrog {
    // Instance variables and constants.

    public static final int ABSOLUTE_MIN_JUMP_DISTANCE = 0;
    public static final int DEFAULT_MAX_DISTANCE = 10;
    public static final double DEFAULT_JUMPINESS = 0.5;
    public static final int DEFAULT_DISTANCE_TRAVELLED = 0;
    String name;
    double jumpiness;
    int minJumpDistance;
    int maxJumpDistance;
    int distanceTravelled;

    // Not finished.
    public int goad() {
        int distanceJumped = 0;
        if (Math.random() <= jumpiness) {
            distanceJumped = (int)(Math.random() * (maxJumpDistance - minJumpDistance)) + minJumpDistance;
            distanceTravelled += distanceJumped;
        }
        return distanceJumped;
    }

    // setters
    // setMaxJumpDistance must make sure that maxJumpDistance is
    //  not less than minJumpDistance.
    public void setMaxJumpDistance(int newMax) {
        setEverything(this.jumpiness, this.minJumpDistance,
                newMax, this.distanceTravelled, this.name);
    }
    
    // setMinJumpDistance must make sure that minJumpDistance is
    //  not less than ABSOLUTE_MIN_JUMP_DISTANCE or greater than maxJumpDistance.
    public void setMinJumpDistance(int newMin) {
        setEverything(this.jumpiness, newMin,
                this.maxJumpDistance, this.distanceTravelled, this.name);
    }

    // setJumpiness must make sure that jumpiness
    //  is not set outside the range (0.0 .. 1.0).
    public void setJumpiness(double newJumpiness) {
        setEverything(newJumpiness, this.minJumpDistance,
                this.maxJumpDistance, this.distanceTravelled, this.name);
    }
    
    public void setDistanceTravelled(int newDistanceTravelled) {
        setEverything(this.jumpiness, this.minJumpDistance,
                this.maxJumpDistance, newDistanceTravelled, this.name);
    }

    public void setName(String newName) {
        setEverything(this.jumpiness, this.minJumpDistance,
                this.maxJumpDistance, this.distanceTravelled, newName);
    }
    
    
    // This is the designated setter.  It is used by all the constructors and
    //  by the mutators (setters).
    private void setEverything(double newJumpiness, int newMinJumpDistance,
            int newMaxJumpDistance, int newDistanceTravelled,
            String nm) {
        if ((newJumpiness > 0.0) && (newJumpiness <= 1.0)) {
            jumpiness = newJumpiness;
        }
        if (newMaxJumpDistance >= minJumpDistance) {
            maxJumpDistance = newMaxJumpDistance;
        }
        if ((newMinJumpDistance >= ABSOLUTE_MIN_JUMP_DISTANCE) && (newMinJumpDistance <= maxJumpDistance)) {
            minJumpDistance = newMinJumpDistance;
        }
        distanceTravelled = newDistanceTravelled; // lets the user set it to whatever.
        name = nm; // lets the user set it to whatever.
    }

    // getters
    public int getMaxJumpDistance() {
        return maxJumpDistance;
    }

    public int getMinJumpDistance() {
        return minJumpDistance;
    }

    public double getJumpiness() {
        return jumpiness;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public String getName() {
        return name;
    }

    // constructors
    RacingFrog() {
        setEverything(DEFAULT_JUMPINESS, ABSOLUTE_MIN_JUMP_DISTANCE, DEFAULT_MAX_DISTANCE,
                DEFAULT_DISTANCE_TRAVELLED, "");
    }

    RacingFrog(String newName) {
        setEverything(DEFAULT_JUMPINESS, ABSOLUTE_MIN_JUMP_DISTANCE, DEFAULT_MAX_DISTANCE,
                DEFAULT_DISTANCE_TRAVELLED, newName);
    }

    RacingFrog(double startingJumpiness, int startingMinJumpDistance, 
            int startingMaxJumpDistance, int startingDistanceTravelled, 
            String startingName) {
        setEverything(startingJumpiness, startingMinJumpDistance, 
                startingMaxJumpDistance, startingDistanceTravelled, startingName);
    }
}

