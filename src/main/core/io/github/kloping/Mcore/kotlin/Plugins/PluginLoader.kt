package io.github.kloping.Mcore.kotlin.Plugins

import net.mamoe.mirai.message.data.Message.toString
import net.mamoe.mirai.message.data.At.target
import net.mamoe.mirai.console.terminal.MiraiConsoleTerminalLoader.main
import net.mamoe.mirai.contact.Contact.id
import net.mamoe.mirai.event.SimpleListenerHost.handleException
import net.mamoe.mirai.event.events.GroupMessageEvent.sender
import net.mamoe.mirai.contact.User.id
import net.mamoe.mirai.event.events.GroupMessageEvent.subject
import net.mamoe.mirai.event.events.GroupMessageEvent.message
import net.mamoe.mirai.event.events.FriendMessageEvent.sender
import net.mamoe.mirai.event.events.FriendMessageEvent.subject
import net.mamoe.mirai.event.events.FriendMessageEvent.message
import net.mamoe.mirai.Bot.configuration
import net.mamoe.mirai.utils.BotConfiguration.autoReconnectOnForceOffline
import net.mamoe.mirai.utils.BotConfiguration.protocol
import net.mamoe.mirai.utils.BotConfiguration.heartbeatStrategy
import net.mamoe.mirai.utils.BotConfiguration.cacheDir
import net.mamoe.mirai.utils.BotConfiguration.fileBasedDeviceInfo
import net.mamoe.mirai.BotFactory.INSTANCE.newBot
import net.mamoe.mirai.Bot.eventChannel
import net.mamoe.mirai.event.EventChannel.registerListenerHost
import net.mamoe.mirai.message.data.MessageChainBuilder.append
import net.mamoe.mirai.message.data.MessageChainBuilder.build
import net.mamoe.mirai.message.data.MessageChain
import java.lang.StringBuilder
import net.mamoe.mirai.message.data.MessageSource
import net.mamoe.mirai.message.data.PlainText
import net.mamoe.mirai.message.data.At
import java.io.PrintStream
import net.mamoe.mirai.contact.Contact
import io.github.kloping.MySpringTool.annotations.AutoStand
import java.lang.NumberFormatException
import io.github.kloping.arr.Class2OMap
import io.github.kloping.MySpringTool.annotations.ReturnResult
import io.github.kloping.MySpringTool.annotations.TimeEve
import net.mamoe.mirai.event.SimpleListenerHost
import kotlin.coroutines.CoroutineContext
import net.mamoe.mirai.event.events.GroupMessageEvent
import io.github.kloping.MySpringTool.StarterApplication
import net.mamoe.mirai.event.events.FriendMessageEvent
import net.mamoe.mirai.event.events.StrangerMessageEvent
import net.mamoe.mirai.event.events.BotOfflineEvent
import io.github.kloping.MySpringTool.Starter
import io.github.kloping.MySpringTool.annotations.CommentScan
import net.mamoe.mirai.Bot
import kotlin.jvm.JvmStatic
import net.mamoe.mirai.utils.BotConfiguration
import net.mamoe.mirai.utils.BotConfiguration.HeartbeatStrategy
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import io.github.kloping.MySpringTool.entity.interfaces.Runner
import kotlin.Throws
import io.github.kloping.MySpringTool.exceptions.NoRunException
import java.lang.Runnable
import net.mamoe.mirai.message.data.MessageChainBuilder
import java.lang.Exception
import java.util.concurrent.ConcurrentHashMap

/**
 * @author github-kloping
 */
object PluginLoader {
    fun load(args: Array<String>?) {
        try {
            val oldPs = System.out
            val oldErr = System.err
            main(args!!)
            System.setErr(oldErr)
            System.setOut(oldPs)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}