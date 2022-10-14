package CaseStudy;

public class VarshPackage {
	public String package_id;
	public String source_place;
	public String destination_place;
	public int number_of_days;
	double basic_fare;
	public double package_cost;
	public VarshPackage(String package_id, String source_place, String destination_place, int number_of_days,
			double basic_fare) {
		super();
		this.package_id = package_id;
		this.source_place = source_place;
		this.destination_place = destination_place;
		this.number_of_days = number_of_days;
		this.basic_fare = basic_fare;
	}
	
public void calculatePacakgeCost() {
	if(this.number_of_days<=5) {this.package_cost= this.basic_fare*this.number_of_days;
	return;}
	if(this.number_of_days>5 && this.number_of_days<=8) {this.package_cost= this.basic_fare*this.number_of_days*0.97;
	return;}
	if(this.number_of_days>8 && this.number_of_days<=10) {this.package_cost= this.basic_fare*this.number_of_days*0.95;
	return;}
	if(this.number_of_days>5) {this.package_cost= this.basic_fare*this.number_of_days*0.93;
	return;}	
	this.package_cost*=1.12;
}
}
