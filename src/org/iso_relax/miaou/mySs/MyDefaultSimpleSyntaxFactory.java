package org.iso_relax.miaou.mySs;

import org.iso_relax.miaou.ss.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyDefaultSimpleSyntaxFactory extends DefaultSimpleSyntaxFactory {

    public PatternNonExistentAttribute createPatternNonExistentAttribute() {
        return (new MyPatternNonExistentAttribute());
    }

    public RootGrammar createRootGrammar() {
        return (new MyRootGrammar());
    }

    public PatternData createPatternData() {
        return (new MyPatternData());
    }

    public Param createParam() {
        return (new MyParam());
    }

    public PatternAttribute createPatternAttribute() {
        return (new MyPatternAttribute());
    }

    public PatternChoice createPatternChoice() {
        return (new MyPatternChoice());
    }
    public PatternGroup createPatternGroup() {
        return (new MyPatternGroup());
    }

    public PatternInterleave createPatternInterleave() {
        return (new MyPatternInterleave());
    }

    public PatternValue createPatternValue() {
        return (new MyPatternValue());
    }

    public PatternList createPatternList() {
        return (new MyPatternList());
    }

    public PatternRef createPatternRef() {
        return (new MyPatternRef());
    }

    public PatternOneOrMore createPatternOneOrMore() {
        return (new MyPatternOneOrMore());
    }

    public PatternNotAllowed createPatternNotAllowed() {
        return (new MyPatternNotAllowed());
    }

    public PatternEmpty createPatternEmpty() {
        return (new MyPatternEmpty());
    }

    public PatternText createPatternText() {
        return (new MyPatternText());
    }

    public PatternOneOrMoreAttribute createPatternOneOrMoreAttribute() {
        return (new MyPatternOneOrMoreAttribute());
    }

    public Define createDefine() {
        return (new MyDefine());
    }


    public DefineElement createDefineElement() {
        return (new MyDefineElement());
    }

    public NameClassAnyName createNameClassAnyName() {
        return (new MyNameClassAnyName());
    }

    public ExceptNameClass createExceptNameClass() {
        return (new MyExceptNameClass());
    }

    public NameClassChoice createNameClassChoice() {
        return (new MyNameClassChoice());
    }

    public NameClassName createNameClassName() {
        return (new MyNameClassName());
    }

    public NameClassNsName createNameClassNsName() {
        return (new MyNameClassNsName());
    }


}