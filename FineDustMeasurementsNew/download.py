import requests
import shutil

days = range(1,32)
months = range(1,13)
years = [2016,2017]
sensors = [1002, 1178, 1098, 2394]

for i in years:
	datey = str(i)
	for j in months:
		datem = "0"+str(j) if j<10 else str(j)
		for z in days:
			dated = "0"+str(z) if z<10 else str(z)
			date = datey+"-"+datem+"-"+dated
			for k in sensors:				
				path = date+"_sds011_sensor_"+str(k)+".csv"
				r = requests.get("http://archive.luftdaten.info/"+date+"/"+path, stream=True)
				print path
				if r.status_code == 200:
				    with open(path, 'wb') as f:
						r.raw.decode_content = True
						print path
						shutil.copyfileobj(r.raw, f)        