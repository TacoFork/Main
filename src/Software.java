public class Software extends Product{
    private String programmer;
    private String platform;
    private String os;

    public Software(){
    }

    public void setProgrammer(String programmer){
        this.programmer = programmer;
    }

    public void setPlatform(String platform){
        this.platform = platform;
    }

    public void setOs(String os){
        this.os = os;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Programmer:         " + this.programmer + "\n" +
                "Platform:           " + this.platform + "\n" +
                "OS:                 " + this.os + "\n";
    }
}
