public class Wilder {
    private String firstname;
    private Boolean aware;

    public Wilder(String firstname, Boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public Boolean getAware() {
        return aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(Boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        String areAware = this.aware ? " et je suis aware" : " et je ne suis pas aware";
        return "Je m'appelle " + this.firstname + areAware;
    }
}
