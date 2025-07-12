public class Clock {

    private int seconds;
    private int minutes;
    private int hours;

    public int getSeconds() {

        return seconds;

    }

    public int getMinutes() {

        return minutes;

    }

    public int getHours() {

        return hours;

    }

    public void setSeconds(int newSeconds) {
        
        if(newSeconds < 60 && newSeconds >= 0) {

            seconds = newSeconds;

        } 

    }

    public void setMinutes(int newMinutes) {

        if(newMinutes < 60 && newMinutes >= 0) {

            minutes = newMinutes;

        }

    }

    public void setHours(int newHours) {

        if(newHours <= 12 && newHours >= 0) {

            hours = newHours;

        }
    }

    public Clock() {

        setHours(12);
        setMinutes(0);
        setSeconds(0);
      
    }

    public Clock(int hours, int minutes, int seconds) {

        setHours(12);
        setMinutes(0);
        setSeconds(0);

        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);

    }

    public String toString() {

        String toString = "";

        if(getHours() < 10 && getMinutes() >= 10 && getSeconds() >= 10) {

            System.out.println("0"+ getHours() + ":" + getMinutes() + ":" + getSeconds());

        } else if (getHours() < 10 && getMinutes() < 10 && getSeconds() >= 10) {

            System.out.println("0"+ getHours() + ":0" + getMinutes() + ":" + getSeconds());

        } else if (getHours() < 10 && getMinutes() < 10 && getSeconds() < 10) {

            System.out.println("0"+ getHours() + ":0" + getMinutes() + ":0" + getSeconds());

        } else if (getHours() >= 10 && getMinutes() < 10 && getSeconds() < 10) {

            System.out.println(""+ getHours() + ":0" + getMinutes() + ":0" + getSeconds());

        } else if (getHours() >= 10 && getMinutes() >= 10  && getSeconds() < 10) {
            
            System.out.println(""+ getHours() + ":" + getMinutes() + ":0" + getSeconds());

        } else if (getHours() >= 10 && getMinutes() < 10 && getSeconds() >= 10) {

            System.out.println(""+ getHours() + ":0" + getMinutes() + ":" + getSeconds());

        } else if (getHours() < 10 && getMinutes() >= 10 && getSeconds() < 10) {

            System.out.println("0"+ getHours() + ":" + getMinutes() + ":0" + getSeconds());

        } else {

            System.out.println(""+ getHours() + ":" + getMinutes() + ":" + getSeconds());

        }

        return toString;
    }

    public void tick() {

        if (getSeconds() < 59) {

            setSeconds(getSeconds() + 1);

        } else if (getSeconds() == 59 && getMinutes() != 59) {

            setSeconds(0);
            setMinutes(getMinutes() + 1);

        } else if (getSeconds() == 59 && getMinutes() == 59 && getHours() != 12) {

            setSeconds( 0);
            setMinutes( 0);
            setHours(getHours() + 1);

        } else if (getSeconds() == 59 && getMinutes() == 59 && getHours() == 12) {

            setHours(0);
            setSeconds( 0);
            setMinutes( 0);
            
        }

        System.out.println(toString());

    }

    public void tick(int seconds) {

        for (int i = 0; i <= seconds; i++) {

            System.out.println(toString());

            if (getSeconds() < 59) {

                setSeconds(getSeconds() + 1);

            } else if (getSeconds() == 59 && getMinutes() != 59) {

                setSeconds( 0);
                setMinutes(getMinutes() + 1);

            } else if (getSeconds() == 59 && getMinutes() == 59 && getHours() != 12) {

                setSeconds( 0);
                setMinutes( 0);
                setHours(getHours() + 1);
                
            } else if (getSeconds() == 59 && getMinutes() == 59 && getHours() == 12) {

                setHours(0);
                setSeconds( 0);
                setMinutes( 0);
                
            }

        }

    }

    public static void main(String[] args) {

        Clock clock = new Clock(12, 59, 58);

        clock.tick(70);
      
    }
    
}
