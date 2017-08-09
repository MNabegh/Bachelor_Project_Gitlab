package sample_programs;

import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class TestOpinionTransitivity 
{
	
	public static void main(String[] args)
	{
		SubjectiveOpinion ab = new SubjectiveOpinion(00.4,0.1,0.5,0.6);
		SubjectiveOpinion be = new SubjectiveOpinion(0.9,0,0.1,0.4);
		SubjectiveOpinion ae = be.discountBy(ab);
		
		System.out.println(ae);
	}

}
