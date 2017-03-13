package com.edicatad.tut.logger;

import java.util.Locale;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import net.minecraftforge.fml.common.TracingPrintStream;
import net.minecraftforge.fml.relauncher.Side;

public class TutLogger {
	public static final TutLogger log = new TutLogger();

    private static boolean configured;

    private Logger myLog;

    static Side side;

    public TutLogger(){
    	
    }
    /**
     * Configure the logger and inject tracing printstreams.
     */
    private static void configureLogging()
    {
        log.myLog = LogManager.getLogger("Tut");
        // Default side to client for test harness purposes
        if (side == null) side = Side.CLIENT;
        ThreadContext.put("side", side.name().toLowerCase(Locale.ENGLISH));
        configured = true;
        
        //TutLogger.fine("Injecting tracing printstreams for STDOUT/STDERR.");
        //System.setOut(new TracingPrintStream(LogManager.getLogger("STDOUT"), System.out));
        //System.setErr(new TracingPrintStream(LogManager.getLogger("STDERR"), System.err));
    }

    public static void log(String targetLog, Level level, String format, Object... data)    {
        LogManager.getLogger(targetLog).log(level, String.format(format, data));
    }

    public static void log(Level level, String format, Object... data)    {
        if (!configured)
        {
            configureLogging();
        }
        log.myLog.log(level, String.format(format, data));
    }

    public static void log(String targetLog, Level level, Throwable ex, String format, Object... data)    {
        LogManager.getLogger(targetLog).log(level, String.format(format, data), ex);
    }

    public static void log(Level level, Throwable ex, String format, Object... data)    {
        if (!configured)
        {
            configureLogging();
        }
        log.myLog.log(level, String.format(format, data), ex);
    }

    public static void severe(String format, Object... data)    {
        log(Level.ERROR, format, data);
    }

    public static void warning(String format, Object... data)    {
        log(Level.WARN, format, data);
    }

    public static void info(String format, Object... data)    {
        log(Level.INFO, format, data);
    }

    public static void fine(String format, Object... data)    {
        log(Level.DEBUG, format, data);
    }

    public static void finer(String format, Object... data)    {
        log(Level.TRACE, format, data);
    }
    
    public Logger getLogger()
    {
        return myLog;
    }
}
