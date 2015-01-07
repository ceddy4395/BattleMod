package com.ceddy4395.battlemod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //create configuration object from the new config
        Configuration configuration = new Configuration(configFile);

        //tries to load in the config file
        try
        {
           configuration.load();

            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        // if any problem catch it and log the exceptions
        catch (Exception e)
        {

        }
        // save the file
        finally
        {
            configuration.save();
        }

    }
}
