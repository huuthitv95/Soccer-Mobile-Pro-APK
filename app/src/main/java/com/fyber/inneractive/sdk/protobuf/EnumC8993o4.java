package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.o4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC8993o4 {
    private static final /* synthetic */ EnumC8993o4[] $VALUES;
    public static final EnumC8993o4 LAZY;
    public static final EnumC8993o4 LOOSE;
    public static final EnumC8993o4 STRICT;

    static {
        EnumC8993o4 enumC8993o4 = new EnumC8993o4() { // from class: com.fyber.inneractive.sdk.protobuf.l4
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC8993o4
            /* JADX INFO: renamed from: a */
            public final Object mo21666a(AbstractC9031w abstractC9031w) {
                return abstractC9031w.mo21739r();
            }
        };
        LOOSE = enumC8993o4;
        EnumC8993o4 enumC8993o5 = new EnumC8993o4() { // from class: com.fyber.inneractive.sdk.protobuf.m4
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC8993o4
            /* JADX INFO: renamed from: a */
            public final Object mo21666a(AbstractC9031w abstractC9031w) {
                return abstractC9031w.mo21740s();
            }
        };
        STRICT = enumC8993o5;
        EnumC8993o4 enumC8993o6 = new EnumC8993o4() { // from class: com.fyber.inneractive.sdk.protobuf.n4
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC8993o4
            /* JADX INFO: renamed from: a */
            public final Object mo21666a(AbstractC9031w abstractC9031w) {
                return abstractC9031w.mo21724e();
            }
        };
        LAZY = enumC8993o6;
        $VALUES = new EnumC8993o4[]{enumC8993o4, enumC8993o5, enumC8993o6};
    }

    public EnumC8993o4(String str, int i) {
        super(str, i);
    }

    public static EnumC8993o4 valueOf(String str) {
        return (EnumC8993o4) Enum.valueOf(EnumC8993o4.class, str);
    }

    public static EnumC8993o4[] values() {
        return (EnumC8993o4[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo21666a(AbstractC9031w abstractC9031w);
}
