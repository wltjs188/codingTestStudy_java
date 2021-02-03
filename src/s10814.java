import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class s10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];
        for(int i=0;i<n;i++){
            Member member = new Member();
            StringTokenizer st = new StringTokenizer(br.readLine());
            member.setNum(i);
            member.setAge(Integer.parseInt(st.nextToken()));
            member.setName(st.nextToken());
            members[i] = member;
        }
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if(o1.getAge()==o2.getAge())
                    return o1.getNum()-o2.getNum();
                return o1.getAge()-o2.getAge();
            }
        });

        for(int i=0;i<members.length;i++){
            System.out.print(members[i].toString());
        }
    }

    static class Member{
        private int num;
        private int age;
        private String name;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return age +" "+name+"\n";
        }
    }
}
