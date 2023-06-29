package level2;

public class Solution15 {

    public static int solution(int n) {

        // k칸 앞으로 점프 or (현재까지 온거리) x 2 위치로 순간이동가능 슈트
        // 순간이동은 배터리 안듬 / k칸 점프는 k만큼 배터리 소모
        // N만큼 떨어진 거리를 가려고함 그 때 최소로 배터리를 쓸 수 있는 양 리턴
        //

        int pos = n;
        int ans = 1;

        while(pos!=1){
            if(pos%2==0) pos = pos/2;
            else {
                pos = (pos-1)/2;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(5000));
    }
}
