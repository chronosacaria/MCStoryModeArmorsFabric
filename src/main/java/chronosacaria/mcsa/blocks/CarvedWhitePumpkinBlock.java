package chronosacaria.mcsa.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.Wearable;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public class CarvedWhitePumpkinBlock extends HorizontalFacingBlock implements Wearable {
    public static final DirectionProperty FACING;


    public CarvedWhitePumpkinBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx){
        return getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(FACING);
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
    }
}
