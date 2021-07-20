public class towerOfHanoi{    
    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n,'A','B','C');
    }
    public static void towerOfHanoi(int n,char c1,char c2,char c3){
        if(n==1){
            System.out.println("Move disk 1 from "+c1+" to "+c2);
            return;
        }
        towerOfHanoi(n-1,c1,c3,c2);
        System.out.println("Move disk "+n+" from "+c1+" to "+c2);
        towerOfHanoi(n-1,c3,c2,c1);
    }
}