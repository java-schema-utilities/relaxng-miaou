package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.btg.*;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

public class MyDefaultBinaryTreeGrammarFactory extends DefaultBinaryTreeGrammarFactory {

    /**
     * Creates a default <code>BinaryTreeGrammar</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BinaryTreeGrammar
     */
    public BinaryTreeGrammar createBinaryTreeGrammar() {
        return new MyBinaryTreeGrammar();
    }
    /**
     * Creates a default <code>BtrExpAtomic</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpAtomic
     */
    public BtrExpAtomic createBtrExpAtomic() {
        return new MyBtrExpAtomic();
    }
    /**
     * Creates a default <code>BtrExpChoice</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpChoice
     */
    public BtrExpChoice createBtrExpChoice() {
        return new MyBtrExpChoice();
    }

    /**
     * Creates a default <code>BtrExpElement</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpElement
     */
    public BtrExpElement createBtrExpElement() {
        return new MyBtrExpElement();
    }

    /**
     * Creates a default <code>BtrExpEnd</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpEnd
     */
    public BtrExpEnd createBtrExpEnd() {
        return new MyBtrExpEnd();
    }

    /**
     * Creates a default <code>BtrExpInterleave</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpInterleave
     */
    public BtrExpInterleave createBtrExpInterleave() {
        return new MyBtrExpInterleave();
    }
    /**
     * Creates a default <code>BtrExpList</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpList
     */
    public BtrExpList createBtrExpList() {
        return new MyBtrExpList();
    }
    /**
     * Creates a default <code>BtrExpNonExistentAttribute</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpNonExistentAttribute
     */
    public BtrExpNonExistentAttribute createBtrExpNonExistentAttribute() {
        return new MyBtrExpNonExistentAttribute();
    }
    /**
     * Creates a default <code>BtrExpNotAllowed</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpNotAllowed
     */
    public BtrExpNotAllowed createBtrExpNotAllowed() {
        return new MyBtrExpNotAllowed();
    }
    /**
     * Creates a default <code>BtrExpOneOrMore</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpOneOrMore
     */
    public BtrExpOneOrMore createBtrExpOneOrMore() {
        return new MyBtrExpOneOrMore();
    }
    /**
     * Creates a default <code>BtrExpOneOrMoreAttribute</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpOneOrMoreAttribute
     */
    public BtrExpOneOrMoreAttribute createBtrExpOneOrMoreAttribute() {
        return new MyBtrExpOneOrMoreAttribute();
    }

    /**
     * Creates a default <code>BtrExpProduct</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpProduct
     */
    public BtrExpProduct createBtrExpProduct() {
        return new MyBtrExpProduct();
    }
    /**
     * Creates a default <code>BtrExpRef</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpRef
     */
    public BtrExpRef createBtrExpRef() {
        return new MyBtrExpRef();
    }
    /**
     * Creates a default <code>BtrExpText</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpText
     */
    public BtrExpText createBtrExpText() {
        return new MyBtrExpText();
    }
    /**
     * Creates a default <code>BtrExpVariable</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return BtrExpVariable
     */
    public BtrExpVariable createBtrExpVariable() {
        return new MyBtrExpVariable();
    }
    /**
     * Creates a default <code>Data</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return Data
     */
    public Data createData() {
        return new MyData();
    }

    /**
     * Creates a default <code>Param</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return Param
     */
    public Param createParam() {
        return new MyParam();
    }
    /**
     * Creates a default <code>Value</code>.
     * This method is a hook method of the AbstractBinaryTreeGrammarFactory.
     *
     * @return Value
     */
    public Value createValue() {
        return new MyValue();
    }
}