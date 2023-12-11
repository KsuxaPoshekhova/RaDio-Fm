public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStations;

    public Radio (){
         maxStations = 9;
    }

    public Radio (int numberOfStations){
        maxStations = numberOfStations - 1;
    }

    public void next() {
        if (currentStation !=  maxStations) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation !=  maxStations) {
            currentStation--;
        } else {
            currentStation =  maxStations - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation >  maxStations) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

