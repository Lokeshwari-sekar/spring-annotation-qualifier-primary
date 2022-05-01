package com.edu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements Processor{

	public void processorFun() {
		System.out.println("mediatek is world number one processor");
		
	}

}
