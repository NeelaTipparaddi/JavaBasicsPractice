public class Carpet {
    private double cost;

    public Carpet(double cost){
        // this.Carpet=Carpet;
        //setCost(cost);
        if(cost<0){
            cost=0;
        }
        this.cost=cost;
    }

    // public void setCost(double cost){
    //     if(cost<0){
    //         cost=0;
    //     }
    //     this.cost=cost;
    // }

    public double getCost(){
        return cost;
    }





}