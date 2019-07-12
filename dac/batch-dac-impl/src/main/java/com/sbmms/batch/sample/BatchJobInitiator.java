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

public class BatchJobInitiator implements Tasklet, InitializingBean{
    private static final Logger logger = LoggerFactory.getLogger(BatchJobInitiator.class);
    
    @Override
    public RepeatStatus execute(StepContribution sc, ChunkContext cc) throws Exception {
        logger.info("Intiated the spring batch Job");
        return RepeatStatus.FINISHED;
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("No propety set in intiator");
    }
    
    
}
