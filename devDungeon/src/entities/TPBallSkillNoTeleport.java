package entities;


import contrib.utils.components.health.DamageType;
import contrib.utils.components.skill.DamageProjectile;
import core.utils.Point;
import core.utils.components.path.IPath;
import core.utils.components.path.SimpleIPath;
import java.util.function.Supplier;


public final class TPBallSkillNoTeleport extends DamageProjectile {
    private static final IPath PROJECTILE_TEXTURES = new SimpleIPath("skills/fireball");

    private static final float PROJECTILE_SPEED = 7.0f;
    private static final int DAMAGE_AMOUNT = 1;
    private static final DamageType DAMAGE_TYPE = DamageType.MAGIC;
    private static final Point HIT_BOX_SIZE = new Point(1, 1);
    private static final float PROJECTILE_RANGE = 7f;
    public TPBallSkillNoTeleport(final Supplier<Point> targetSelection) {
        super(
            "tpball",
            PROJECTILE_TEXTURES,
            PROJECTILE_SPEED,
            DAMAGE_AMOUNT,
            DAMAGE_TYPE,
            HIT_BOX_SIZE,
            targetSelection,
            PROJECTILE_RANGE,
            DamageProjectile.DEFAULT_ON_WALL_HIT,
            (projectile, entity) -> {

            });
        this.tintColor(0xFF00FFFF);

    }
}
