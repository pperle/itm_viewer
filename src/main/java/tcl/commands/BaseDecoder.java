package tcl.commands;

import org.jetbrains.annotations.NotNull;
import tcl.parser.TclEntity;

import java.nio.ByteBuffer;
import java.util.List;

public interface BaseDecoder {
    public List<TclEntity> decodeCommand(@NotNull ByteBuffer bb);
}
