/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.batch.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author TP00455540
 */
public class BatchJobError  implements Tasklet, InitializingBean{
    //private static final Logger logger = LoggerFactory.getLogger(BatchJobError.class);
     @Override
    public RepeatStatus execute(StepContribution sc, ChunkContext cc) throws Exception {
       // logger.info("Error the spring batch Job");
         System.out.println("Error the spring batch Job");
        return RepeatStatus.FINISHED;
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
      //  logger.info("Error No propety set in intiator");
    }
}
