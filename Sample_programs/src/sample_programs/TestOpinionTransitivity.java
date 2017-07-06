package sample_programs;

import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class TestOpinionTransitivity 
{
	
	public static void main(String[] args)
	{
		SubjectiveOpinion aa = new SubjectiveOpinion(0.9,0,0.1);
		SubjectiveOpinion ae = new SubjectiveOpinion(1,0,0);
		ae = ae.discountBy(aa);
		
		System.out.println(args[0] + " "+TestOpinionCumulation.name());
	}

}
