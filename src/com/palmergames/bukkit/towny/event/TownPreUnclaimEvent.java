package com.palmergames.bukkit.towny.event;

import com.palmergames.bukkit.towny.object.Town;
import com.palmergames.bukkit.towny.object.TownBlock;
import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event is no longer fired by Towny and is marked for future removal.
 *
 * @deprecated As of 0.96.5.5, please use {@link com.palmergames.bukkit.towny.event.town.TownPreUnclaimEvent}.
 */
@Deprecated
public class TownPreUnclaimEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final TownBlock townBlock;
    private Town town;
    private boolean isCancelled = false;

    @Override
    public HandlerList getHandlers() {
    	
        return handlers;
    }
    
    public static HandlerList getHandlerList() {

		return handlers;
	}

    /**
     * Event thrown prior to a TownBlock being unclaimed by a Town.
     * This is cancellable but it is probably not a good idea to do
     * so without testing.
     *  
     * @param _townBlock - The TownBlock that will be unclaimed.
     */
    public TownPreUnclaimEvent(TownBlock _townBlock) {
        super(!Bukkit.getServer().isPrimaryThread());
        this.townBlock = _townBlock;
        this.town = townBlock.getTownOrNull();
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
    
    /**
     *
     * @return the Town.
     */
    public Town getTown() {
        return town;
    }
    
    /**
    *
    * @return the soon-to-be unclaimed TownBlock.
    *
    */
   public TownBlock getTownBlock() {
       return townBlock;
   }
    
}