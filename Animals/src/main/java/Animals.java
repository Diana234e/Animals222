public class Animals {
    public int sum(int N){
        int rez = 0;
        for (int i=1; i<=N; i++)
            rez +=i;
        return rez;
    }
    public int subtract(int N){
        int rez = 0;
        for (int i=1; i<=N; i++)
            rez -=i;
        return rez;
    }
}
