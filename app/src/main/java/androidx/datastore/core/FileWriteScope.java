package androidx.datastore.core;

import com.ironsource.C11744X3;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m43474d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, m43475d2 = {"Landroidx/datastore/core/FileWriteScope;", "T", "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", C11744X3.i.f26356b, "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.FileWriteScope$writeData$1 */
    /* JADX INFO: compiled from: FileStorage.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "androidx.datastore.core.FileWriteScope", m43504f = "FileStorage.kt", m43505i = {0}, m43506l = {201}, m43507m = "writeData", m43508n = {"stream"}, m43509s = {"L$1"})
    static final class C03761 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03761(FileWriteScope<T> fileWriteScope, Continuation<? super C03761> continuation) {
            super(continuation);
            this.this$0 = fileWriteScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(File file, Serializer<T> serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.WriteScope
    public Object writeData(T t, Continuation<? super Unit> continuation) throws Throwable {
        C03761 c03761;
        java.io.Closeable closeable;
        FileOutputStream fileOutputStream;
        if (continuation instanceof C03761) {
            c03761 = (C03761) continuation;
            if ((c03761.label & Integer.MIN_VALUE) != 0) {
                c03761.label -= Integer.MIN_VALUE;
            } else {
                c03761 = new C03761(this, continuation);
            }
        } else {
            c03761 = new C03761(this, continuation);
        }
        Object obj = c03761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c03761.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            checkNotClosed();
            FileOutputStream fileOutputStream2 = new FileOutputStream(getFile());
            try {
                FileOutputStream fileOutputStream3 = fileOutputStream2;
                Serializer<T> serializer = getSerializer();
                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream3);
                c03761.L$0 = fileOutputStream2;
                c03761.L$1 = fileOutputStream3;
                c03761.label = 1;
                if (serializer.writeTo(t, uncloseableOutputStream, c03761) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = fileOutputStream2;
                fileOutputStream = fileOutputStream3;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) c03761.L$1;
            closeable = (java.io.Closeable) c03761.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    kotlin.p300io.CloseableKt.closeFinally(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        Unit unit = Unit.INSTANCE;
        kotlin.p300io.CloseableKt.closeFinally(closeable, null);
        return Unit.INSTANCE;
    }
}
