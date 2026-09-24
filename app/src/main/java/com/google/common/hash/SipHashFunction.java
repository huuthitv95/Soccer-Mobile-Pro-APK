package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    private final int f22546c;

    /* JADX INFO: renamed from: d */
    private final int f22547d;

    /* JADX INFO: renamed from: k0 */
    private final long f22548k0;

    /* JADX INFO: renamed from: k1 */
    private final long f22549k1;

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    SipHashFunction(int c, int d, long k0, long k1) {
        Preconditions.checkArgument(c > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c);
        Preconditions.checkArgument(d > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d);
        this.f22546c = c;
        this.f22547d = d;
        this.f22548k0 = k0;
        this.f22549k1 = k1;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f22546c, this.f22547d, this.f22548k0, this.f22549k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f22546c + "" + this.f22547d + "(" + this.f22548k0 + ", " + this.f22549k1 + ")";
    }

    public boolean equals(@CheckForNull Object object) {
        if (object instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) object;
            if (this.f22546c == sipHashFunction.f22546c && this.f22547d == sipHashFunction.f22547d && this.f22548k0 == sipHashFunction.f22548k0 && this.f22549k1 == sipHashFunction.f22549k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((getClass().hashCode() ^ this.f22546c) ^ this.f22547d)) ^ this.f22548k0) ^ this.f22549k1);
    }

    private static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b */
        private long f22550b;

        /* JADX INFO: renamed from: c */
        private final int f22551c;

        /* JADX INFO: renamed from: d */
        private final int f22552d;
        private long finalM;

        /* JADX INFO: renamed from: v0 */
        private long f22553v0;

        /* JADX INFO: renamed from: v1 */
        private long f22554v1;

        /* JADX INFO: renamed from: v2 */
        private long f22555v2;

        /* JADX INFO: renamed from: v3 */
        private long f22556v3;

        SipHasher(int c, int d, long k0, long k1) {
            super(8);
            this.f22550b = 0L;
            this.finalM = 0L;
            this.f22551c = c;
            this.f22552d = d;
            this.f22553v0 = 8317987319222330741L ^ k0;
            this.f22554v1 = 7237128888997146477L ^ k1;
            this.f22555v2 = 7816392313619706465L ^ k0;
            this.f22556v3 = 8387220255154660723L ^ k1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(ByteBuffer buffer) {
            this.f22550b += 8;
            processM(buffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(ByteBuffer buffer) {
            this.f22550b += (long) buffer.remaining();
            int i = 0;
            while (buffer.hasRemaining()) {
                this.finalM ^= (((long) buffer.get()) & 255) << i;
                i += 8;
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode makeHash() {
            long j = this.finalM ^ (this.f22550b << 56);
            this.finalM = j;
            processM(j);
            this.f22555v2 ^= 255;
            sipRound(this.f22552d);
            return HashCode.fromLong(((this.f22553v0 ^ this.f22554v1) ^ this.f22555v2) ^ this.f22556v3);
        }

        private void processM(long m) {
            this.f22556v3 ^= m;
            sipRound(this.f22551c);
            this.f22553v0 = m ^ this.f22553v0;
        }

        private void sipRound(int iterations) {
            for (int i = 0; i < iterations; i++) {
                long j = this.f22553v0;
                long j2 = this.f22554v1;
                this.f22553v0 = j + j2;
                this.f22555v2 += this.f22556v3;
                this.f22554v1 = Long.rotateLeft(j2, 13);
                long jRotateLeft = Long.rotateLeft(this.f22556v3, 16);
                long j3 = this.f22554v1;
                long j4 = this.f22553v0;
                this.f22554v1 = j3 ^ j4;
                this.f22556v3 = jRotateLeft ^ this.f22555v2;
                long jRotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f22555v2;
                long j6 = this.f22554v1;
                this.f22555v2 = j5 + j6;
                this.f22553v0 = jRotateLeft2 + this.f22556v3;
                this.f22554v1 = Long.rotateLeft(j6, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f22556v3, 21);
                long j7 = this.f22554v1;
                long j8 = this.f22555v2;
                this.f22554v1 = j7 ^ j8;
                this.f22556v3 = jRotateLeft3 ^ this.f22553v0;
                this.f22555v2 = Long.rotateLeft(j8, 32);
            }
        }
    }
}
