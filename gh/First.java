package gh;

public class First {
    public static void main(String[] args) {
        int n = 5;
        int[] ar = new int[] { 2, -7, 8, -1, 20 };

        int l = 0;
        int r = n - 1;
        int dir = 0;
        int chance = 1;
        int t1 = 0, t2 = 0;

        while (l <= r) {
            int sm =0;

            if (dir == 1 || dir == 2) {   
                int idx = (dir == 1) ?l:r;
                if(ar[idx] >=0){
                    sm += ar[idx];
                    if(dir == 1)
                        l++;
                    else 
                        r++;
                    if(ar[idx] == 0){
                        dir = 0;
                        chance = (chance == 1) ?2:1;
                    }

                }else{
                    dir = 0;
                    chance = (chance == 1) ?2:1;
                }

         
            } 
            else {
                if (ar[l] < ar[r]) {
                    dir = 2;
                    sm += ar[r];
                    if(ar[r] <= 0){
                        chance = (chance == 1) ? 2 : 1 ;
                        dir = 0;
                    }
                    r--;
                } else {
                    dir = 1;
                    sm += ar[l];
                    if(ar[l] <= 0){
                        chance = (chance == 1) ? 2 : 1 ;
                        dir = 0;
                    }
                    l++;
                }
            }

            if (chance == 1)
                t1 += sm;
            else
                t2 += sm;
        }

        System.out.println(t1+" "+t2);
    }
}