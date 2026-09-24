package androidx.media3.extractor.mp4;

import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, int[] iArr) {
        ImmutableIntArray immutableIntArrayM22969of;
        this.majorBrand = i;
        if (iArr != null) {
            immutableIntArrayM22969of = ImmutableIntArray.copyOf(iArr);
        } else {
            immutableIntArrayM22969of = ImmutableIntArray.m22969of();
        }
        this.compatibleBrands = immutableIntArrayM22969of;
    }
}
