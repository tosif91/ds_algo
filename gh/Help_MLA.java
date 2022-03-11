package gh;

public class Help_MLA {
    public static void main(String[] args) {
        int[] ar = new int[3];
        ar[0]=10;
        ar[1] = 30;
        ar[2] = 20;
        int m1 = 2;
        int m2 = 4;
        getVaccineTime()
    }

    public static int getVaccineTime(int[] ar, int idx,int v){
        if(idx == ar.length){
            return 0;
        }
        int ct = ar[idx] * v;
        int t1 = getVaccineTime(ar ,idx+1,2);
        int t2 = getVaccineTime(ar ,idx+1,4);

        return ct +=  (t1<t2) ? t1 : t2;

    }
}
