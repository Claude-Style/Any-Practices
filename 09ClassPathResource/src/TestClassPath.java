/*
 * #Copyright#
 * Copyright Transdyn, Inc. All rights reserved.
 * TRANSDYN PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * #EndCopyright#
 */

package com.transdyn.dynac.comm.webservice;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

/**
 *
 *
 * @author cshao
 */
public class TestClassPath {
    public static void main(String[] args) throws IOException
    {
        String dictionaryFilename = "/UKVC8-OrbbControl-1.4.wsdl";
//        String dictionaryFilename = "/com/transdyn/dynac/orbb/cctv/DefaultCclCamera.class";
        ClassPathResource dictionaryFileResource = new ClassPathResource( dictionaryFilename );
        //System.out.println( dictionaryFileResource.getURL() );
        if(dictionaryFileResource.exists())
        {
            System.out.println( "path:"+dictionaryFileResource.getURL() );
        }
        else
        {
            System.out.println( "not found" );
        }
    }
}
