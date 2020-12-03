package org.meditation.ez4h.translators.javaTranslators;

import com.github.steveice10.mc.protocol.packet.ingame.client.player.ClientPlayerSwingArmPacket;
import com.github.steveice10.packetlib.packet.Packet;
import com.nukkitx.protocol.bedrock.packet.AnimatePacket;
import org.meditation.ez4h.bedrock.Client;
import org.meditation.ez4h.translators.JavaTranslator;

public class ClientPlayerSwingArmPacketTranslator implements JavaTranslator {
    @Override
    public void translate(Packet inPacket, Client client) {
        ClientPlayerSwingArmPacket packet=(ClientPlayerSwingArmPacket)inPacket;
        AnimatePacket animatePacket=new AnimatePacket();
        animatePacket.setAction(AnimatePacket.Action.SWING_ARM);
        animatePacket.setRuntimeEntityId(client.clientStat.entityId);
        client.bedrockSession.sendPacket(animatePacket);
    }
}