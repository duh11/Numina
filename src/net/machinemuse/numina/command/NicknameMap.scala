package net.machinemuse.numina.command

import net.machinemuse.numina.scala.MuseRegistry
import net.minecraftforge.event.ForgeSubscribe
import net.minecraftforge.event.entity.player.PlayerEvent

/**
 * Author: MachineMuse (Claire Semple)
 * Created: 10:02 PM, 9/6/13
 */
object NicknameMap extends MuseRegistry[String] {

  @ForgeSubscribe def onNameFormat(e: PlayerEvent.NameFormat) {
    NicknameMap.get(e.username) map {
      dn: String =>
        e.displayname = dn
    }
  }
}
