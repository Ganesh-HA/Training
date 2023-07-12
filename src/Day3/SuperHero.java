package Day3;
public class SuperHero {
    private String name;
    private String power;
    private String superpower;

    /*public SuperHero(String name, String power, String superpower) {
        this.name = name;
        this.power = power;
        this.superpower = superpower;
    }*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }

    public String getSuperpower() {

        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", SuperPower='" + superpower + '\'' +
                '}';
    }
}
