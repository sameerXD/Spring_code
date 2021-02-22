package gettersSetters;

public class BCoach {
  private IFund fund;

public IFund getFund() {
	return fund;
}

public void setFund(IFund fund) {
	this.fund = fund;
}
  public String getWorkout() {
	  return "B Coaching";
  }
  
  public String getDailyFortune(){
	  return fund.getFunds();
  }
}
