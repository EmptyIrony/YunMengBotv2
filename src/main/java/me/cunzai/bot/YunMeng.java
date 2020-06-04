package me.cunzai.bot;

import kotlinx.coroutines.Job;
import net.mamoe.mirai.console.plugins.PluginBase;
import net.mamoe.mirai.contact.Contact;
import net.mamoe.mirai.message.GroupMessage;
import net.mamoe.mirai.message.GroupMessageEvent;
import net.mamoe.mirai.message.MessageReceipt;
import net.mamoe.mirai.message.data.*;

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class YunMeng extends PluginBase {

    public void onLoad() {
        getLogger().info("Plugin loaded!");
    }

    public void onEnable() {
        getLogger().info("Plugin enabled!");

        this.getEventListener()
                .subscribeAlways(GroupMessageEvent.class,event -> {

                });




    }

}          