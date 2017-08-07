import random
import os
import sys
from multiprocessing import Process

def runCommand1(f,d,a,date,n):

				command ="java -jar /home/nabegh/Bachelor/SubjectooSim/Run.jar "+str(f)+' '+str(d)+' '+str(a)+" "+str(date)+" "+str(n)
				os.system(command)

def main():		

	month = random.randint(6,8);
	day=random.randint(8,30);

	if month == 7:
		day=random.randint(1,8);
	else:
		day=random.randint(8,31);

	if day > 9:
		date = "2017-0"+str(month)+"-"+str(day)
	else:
		date = "2017-0"+str(month)+"-0"+str(day)


	decay = ["0.975","0.9","0.8","0.7","0.6","0.5"]
	add = ["-1","5","10","15","50","200"]
	number = ["1","2","3","4","5","6"]
	first = ["true" , "false"]
	period = ["1", "2","3", "4","5"]
	frequency = ["6"," 12", "18","24"]

	for d in decay:
		for f in first:
			for n in number:
				for a in add:
					command ="sudo java -jar /home/nabegh/Bachelor/SubjectooSim/Constant_Sim/Run.jar "+str(f)+' '+str(d)+' '+str(a)+" "+str(date)+" "+str(n)
					os.system(command)
			command2 = "sudo java -jar /home/nabegh/Bachelor/SubjectooSim/Constant_Sim/Run2.jar "+str(f)+' '+str(d)+' '+str(date)
			os.system(command2)



if __name__=='__main__':
	main()