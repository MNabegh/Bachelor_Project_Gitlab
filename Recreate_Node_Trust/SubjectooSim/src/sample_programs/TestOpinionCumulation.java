package sample_programs;

import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class TestOpinionCumulation 
{
	
	public static void main(String[] args) 
	{
		SubjectiveOpinion ax = new SubjectiveOpinion(0.7,0,0.3,0.5);
		SubjectiveOpinion bx = new SubjectiveOpinion(0.4,0.3,0.3,0.5);
		SubjectiveOpinion tx = ax.fuse(bx);
		System.out.println(tx);
	}

}
