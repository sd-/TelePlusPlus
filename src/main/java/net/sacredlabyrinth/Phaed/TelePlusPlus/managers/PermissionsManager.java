package net.sacredlabyrinth.Phaed.TelePlusPlus.managers;

import net.sacredlabyrinth.Phaed.TelePlusPlus.TelePlusPlus;

import org.bukkit.plugin.Plugin;

import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public class PermissionsManager {
    private TelePlusPlus plugin;
    
    public final String menu = "tpp.tp.menu";    
    public final String player = "tpp.tp.player";
    public final String coords = "tpp.tp.coords";
    public final String here = "tpp.tp.here";
    public final String toggle = "tpp.tp.toggle";
    public final String back = "tpp.tp.back";
    public final String origin = "tpp.tp.origin";
    public final String clear = "tpp.tp.clear";
    public final String lightning = "tpp.tp.lightning";
    public final String othersPlayer = "tpp.others.player";
    public final String othersCoords = "tpp.others.coords";
    public final String world = "tpp.world.tp";
    public final String top = "tpp.jump.top";
    public final String up = "tpp.jump.up";
    public final String jump = "tpp.jump.jump";
    public final String above = "tpp.mod.above";
    public final String mass = "tpp.mod.mass";
    public final String tool = "tpp.mod.tool";
    public final String mover = "tpp.mod.mover";    
    public final String noTp = "tpp.mod.notp";    
    public final String notify = "tpp.mod.notify";
    public final String take = "tpp.mod.take";
    public final String bypassLog = "tpp.admin.bypass.log";    
    public final String bypassNotify = "tpp.admin.bypass.notify";
    public final String bypassNoTp = "tpp.admin.bypass.notp";
    public final String request = "tpp.request";
    public final String options = "tpp.admin.options";
    public final String version = "tpp.version";
    
    public PermissionsManager(TelePlusPlus plugin) {
        this.plugin = plugin;
        
        //Register permissions
        plugin.getServer().getPluginManager().addPermission(new Permission(menu,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(player,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(coords,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(here,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(toggle,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(back,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(origin,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(clear,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(lightning,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(othersPlayer,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(othersCoords,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(world,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(top,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(up,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(jump,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(above,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(mover,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(noTp,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(notify,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(take,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(bypassLog,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(bypassNotify,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(bypassNoTp,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(request,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(options,PermissionDefault.OP));
        plugin.getServer().getPluginManager().addPermission(new Permission(version,PermissionDefault.OP));
        
        plugin.getServer().getPluginManager().addPermission(new Permission(mass,PermissionDefault.FALSE)); //Worlds most dangerous command
        

        
    }
    
    public boolean hasPermission(Player player, String permission) {
        if (player == null) { return false; }
        return player.hasPermission(permission);
    }
}
