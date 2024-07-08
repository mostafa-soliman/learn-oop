package fadali;

public class PersonalInformation {
  private String FName;
  private String MName;
  private String LName;
  private String BloodGroup;
  private String AccountNumber;
  private String Nationity;
  private String YearOfBirth;

  public PersonalInformation() {

  }

  public PersonalInformation(String FName, String MName, String LName, String BloodGroup,
      String AccountNumber, String Nationity, String YearOfBirth) {
    this.FName = FName;
    this.MName = MName;
    this.LName = LName;
    this.BloodGroup = BloodGroup;
    this.AccountNumber = AccountNumber;
    this.Nationity = Nationity;
    this.YearOfBirth = YearOfBirth;
  }

  // Getters and Setters
  public String getFName() {
    return FName;
  }

  public void setFName(String FName) {
    this.FName = FName;
  }

  public String getMName() {
    return MName;
  }

  public void setMName(String MName) {
    this.MName = MName;
  }

  public String getLName() {
    return LName;
  }

  public void setLName(String LName) {
    this.LName = LName;
  }

  public String getBloodGroup() {
    return BloodGroup;
  }

  public void setBloodGroup(String BloodGroup) {
    this.BloodGroup = BloodGroup;
  }

  public String getAccountNumber() {
    return AccountNumber;
  }

  public void setAccountNumber(String AccountNumber) {
    this.AccountNumber = AccountNumber;
  }

  public String getNationity() {
    return Nationity;
  }

  public void setNationity(String Nationity) {
    this.Nationity = Nationity;
  }

  public String getYearOfBirth() {
    return YearOfBirth;
  }

  public void setYearOfBirth(String YearOfBirth) {
    this.YearOfBirth = YearOfBirth;
  }

  @Override
  public String toString() {
    return "PersonalInformation [FName=" + FName + ", MName=" + MName + ", LName=" + LName + ", BloodGroup="
        + BloodGroup + ", AccountNumber=" + AccountNumber + ", Nationity=" + Nationity + ", YearOfBirth="
        + YearOfBirth + "]";
  }
}
