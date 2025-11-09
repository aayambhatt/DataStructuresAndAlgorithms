package warmup.functions;

public class VoteProgram {
    static String isEligibleToVote(int age){
        if(age<18){
            return "Not Eligible to vote";
        }
        else{
            return "Eligible to vote";
        }
    }

    public static void main(String[] args) {
        String res1 = isEligibleToVote(23);
        System.out.println(res1);

        String res2 = isEligibleToVote(17);
        System.out.println(res2);

    }
}
