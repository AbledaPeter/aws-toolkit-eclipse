/*
 * Copyright 2010-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.elasticbeanstalk;

public interface ConfigurationOptionConstants {

    public static final String ENVIRONMENT = "aws:elasticbeanstalk:application:environment";
    public static final String HOSTMANAGER = "aws:elasticbeanstalk:hostmanager";
    public static final String JVMOPTIONS  = "aws:elasticbeanstalk:container:tomcat:jvmoptions";
    public static final String SNS_TOPICS  = "aws:elasticbeanstalk:sns:topics";
    public static final String APPLICATION = "aws:elasticbeanstalk:application";
    public static final String ENVIRONMENT_TYPE = "aws:elasticbeanstalk:environment";

    public static final String TRIGGER             = "aws:autoscaling:trigger";
    public static final String ASG                 = "aws:autoscaling:asg";
    public static final String POLICIES            = "aws:elb:policies";
    public static final String HEALTHCHECK         = "aws:elb:healthcheck";
    public static final String LOADBALANCER        = "aws:elb:loadbalancer";
    public static final String LAUNCHCONFIGURATION = "aws:autoscaling:launchconfiguration";

    public static final String SINGLE_INSTANCE = "Single Instance";
    public static final String LOAD_BALANCED = "Load Balanced";
}
