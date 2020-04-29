package com.klab.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileProcessingUsingStream {
	
	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\kjayar15\\Documents\\Iteration\\IterationR8.3.1_US1473543\\OTBConstrainedVolumes_AP09A_CTC.tab";
		
		
			   //Stream<String> stream = Files.lines(Paths.get(fileName)).skip(1).parallel();
			   //stream.parallel().forEach(System.out::println);
			   
			   
			  /* Stream<String[]> linesA = Files.lines(Paths.get(fileName)).
					   skip(1).parallel().map(x -> 
						   x.split("\\t")
						   ).parallel();
			   
			   linesA.forEach(x -> System.out.println(x[0] +"-----"+ x[1]));
			   
			   List<BEntity> bEntites = linesA.map(x -> {
				   BEntity bEntity = new BEntity();
				   bEntity.setPpv(x[0]);
				   bEntity.setVl(x[1]);
				   
				   return bEntity;
			   }).collect(Collectors.toList());
			   System.out.println(bEntites);*/
				
			   long startTime = System.currentTimeMillis();
			   new FileProcessingUsingStream().extracted(fileName);
			   long endTime = System.currentTimeMillis();
			   
			   long duration = (endTime - startTime);
			   
			   System.out.println("duration"+duration);
			   
		
	}

	public void extracted(String fileName) {
		try(Stream<String[]> linesA = Files.lines(Paths.get(fileName)).
				   skip(1).parallel().map(x -> 
				   x.split("\\t")
				   ).parallel()) {
			
			
			List<BEntity> bEntites = linesA.map(x -> {
				return getBEntity(x);
						   
					   }).collect(Collectors.toList());
		   
		   
		   //bEntites.parallelStream().forEach(x -> System.out.println(x));
	} catch(IOException e) {
		e.printStackTrace();
	} 
	}

	private BEntity getBEntity(String[] x) {
		final Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		BEntity bEntity = new BEntity();
		bEntity.setPpvCode(x[CFFConstraintVolumesFileColumnIndex.PPV_CODE.getValue()]);
		bEntity.setPtvl(x[CFFConstraintVolumesFileColumnIndex.PTVL_CODE.getValue()]);
		bEntity.setModelYear(Integer.parseInt(x[CFFConstraintVolumesFileColumnIndex.MODEL_YEAR.getValue()]));
		bEntity.setMarketWersCode(x[CFFConstraintVolumesFileColumnIndex.MARKET_WERS_CODE.getValue()]);
		bEntity.setChannelWersCode(x[CFFConstraintVolumesFileColumnIndex.CHANNEL_WERS_CODE.getValue()]);
		bEntity.setControllableFeature(x[CFFConstraintVolumesFileColumnIndex.CONTROLLABLE_FEATURE.getValue()]);
		bEntity.setBuildWeek(Integer.parseInt(x[CFFConstraintVolumesFileColumnIndex.BUILD_WEEK.getValue()]));
		bEntity.setConstraintExpression(x[CFFConstraintVolumesFileColumnIndex.CONSTRAINT_EXPRESSION.getValue()]);
		bEntity.setOperatorCode(x[CFFConstraintVolumesFileColumnIndex.OPERATOR.getValue()]);
		bEntity.setVolume(Integer.parseInt(x[CFFConstraintVolumesFileColumnIndex.VOLUME.getValue()]));
		bEntity.setPriority(Integer.parseInt(x[CFFConstraintVolumesFileColumnIndex.PRIORITY.getValue()]));
		bEntity.setAsOfDate(Integer.parseInt(x[CFFConstraintVolumesFileColumnIndex.AS_OF_DATE.getValue()]));
		bEntity.setPlantCode(x[CFFConstraintVolumesFileColumnIndex.PLANT_CODE.getValue()]);
		bEntity.setCreatedUser("SYSTEM");
		bEntity.setCreatedTimeStamp(timeStamp);
		bEntity.setLastUpdatedUser("SYSTEM");
		bEntity.setLastUpdatedTimeStamp(timeStamp);
				   return bEntity;
	}
	
	

}
