package betteradvancements.api.fabric.event;

import betteradvancements.api.event.IAdvancementDrawConnectionsEvent;
import net.minecraft.advancements.Advancement;

import java.util.ArrayList;
import java.util.List;

/**
 *  Event fired during advancement connection drawing.
 *
 *  Used for adding extra connection lines.
 */
public class AdvancementDrawConnectionsEvent implements IAdvancementDrawConnectionsEvent {
    /**
     * Advancement having its connection lines drawn.
     */
    private final Advancement advancement;
    /**
     * Extra connections to draw lines to.
     */
    private final List<Advancement> extraConnections;

    public AdvancementDrawConnectionsEvent(Advancement advancement) {
        this.advancement = advancement;
        this.extraConnections = new ArrayList<>();
    }

    public Advancement getAdvancement() {
        return this.advancement;
    }

    public List<Advancement> getExtraConnections() {
        return this.extraConnections;
    }
}
