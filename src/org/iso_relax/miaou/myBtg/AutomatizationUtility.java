package org.iso_relax.miaou.myBtg;

import org.iso_relax.miaou.abstractBta.*;
import org.iso_relax.miaou.btg.Data;
import org.iso_relax.miaou.btg.Value;
import org.iso_relax.miaou.btg.IBtrExpAtomicChoice1;
import org.iso_relax.miaou.houseKeeping.SymbolTables;

/**
 * @author <a href="mailto:eb2m-mrt@asahi-net.or.jp">MURATA Makoto</a>
 * @version 0.3
 *
 */

class AutomatizationUtility {

  static private AutomatizationUtility singleInstance;

  org.iso_relax.miaou.bta.IBinaryTreeAutomatonFactory factory =
    org.iso_relax.miaou.bta.BinaryTreeAutomatonFactory.getFactory();

  public static short NEW2         =  2;
  public static short NEW1         =  1;
  public static short END          =  0;
  public static short DUMMY        = -1;
  public static short DUMMYLEFT    = -2;
  public static short DUMMYRIGHT   = -3;
  public static short DUMMYSTART1  = -4;
  public static short DUMMYSTART2  = -5;
  public static short DUMMYEND1    = -6;
  public static short DUMMYEND2    = -7;
  public static short NAMEDDUMMIES = -10;


  private AutomatizationUtility () {
  }

  static public AutomatizationUtility singleInstance() {
    if (singleInstance == null)
      singleInstance = new AutomatizationUtility();
    return singleInstance;
  }


  public AbstractBranchingTransition createBranchingTransition(
      int source,
      int firstTarget,
      int secondTarget)
    {
    AbstractBranchingTransition bt =
      (AbstractBranchingTransition)factory.createBranchingTransition();
    bt.setSource(source);
    bt.setFirstTarget(firstTarget);
    bt.setSecondTarget(secondTarget);
    return bt;
  }

  public AbstractMergingTransition createMergingTransition(
      int firstSource,
      int secondSource,
      int target) {

    AbstractMergingTransition mt =
      (AbstractMergingTransition)factory.createMergingTransition();
    mt.setFirstSource(firstSource);
    mt.setSecondSource(secondSource);
    mt.setTarget(target);
    return mt;
  }

  public AbstractElementTransition createElementTransition(
    int left,
    int right,
    int target,
    int nameClass) {

    AbstractElementTransition aet =
      (AbstractElementTransition)factory.createElementTransition();
    aet.setTarget(target);
    aet.setRight(right);
    aet.setLeft(left);
    aet.setNameClass(nameClass);
    return aet;
  }

  public AbstractBinaryTreeAutomaton createBinaryTreeAutomaton() {
   return (AbstractBinaryTreeAutomaton)factory.createBinaryTreeAutomaton();
  }

  public AbstractFinalTransition createFinalTransition(int fnew) {
    AbstractFinalTransition aft =
      (AbstractFinalTransition)factory.createFinalTransition();
    aft.setState(fnew);
    return aft;
  }

  public AbstractStartTransition createStartTransition(int state) {
    AbstractStartTransition st =
      (AbstractStartTransition)factory.createStartTransition();
    st.setState(state);
    return st;
  }

  public AbstractAtomicTransition createAtomicTransition(
      int right,
      int target,
      IBtrExpAtomicChoice1 content) {

    AbstractAtomicTransition aAtomicTrans =
      (AbstractAtomicTransition)factory.createAtomicTransition();
    aAtomicTrans.setTarget(target);
    aAtomicTrans.setRight(right);

    //Casting to IMyDataChoice should work, since the content is
    //either Data or Value.
    aAtomicTrans.setContent(((IMyDataChoice)content).convert());

    return aAtomicTrans;
  }


  public AbstractOneOrMoreAttributeTransition createOneOrMoreAttributeTransition(
    int left,
    int right,
    int target,
    int nameClass) {


    AbstractOneOrMoreAttributeTransition oomat =
      (AbstractOneOrMoreAttributeTransition)factory.createOneOrMoreAttributeTransition();
    oomat.setLeft(left);
    oomat.setRight(right);
    oomat.setTarget(target);
    oomat.setNameClass(nameClass);
    return oomat;
  }

  public AbstractNonExistentAttributeTransition createNonExistentAttributeTransition(
    int right,
    int target,
    int nameClass,
    int exceptNameClass) {

    AbstractNonExistentAttributeTransition neat =
      (AbstractNonExistentAttributeTransition)factory.createNonExistentAttributeTransition();
    neat.setRight(right);
    neat.setTarget(target);
    neat.setNameClass(nameClass);
    neat.setExceptNameClass(exceptNameClass);
    return neat;
  }

  public AbstractListTransition createListTransition(
    int target,
    int left,
    int right) {

    AbstractListTransition bt =
      (AbstractListTransition)factory.createListTransition();
    bt.setTarget(target);
    bt.setLeft(left);
    bt.setRight(right);
    return bt;
  }

  public AbstractTextTransition createTextTransition(
    int right,
    int target) {

    AbstractTextTransition tt =
      (AbstractTextTransition)factory.createTextTransition();
    tt.setRight(right);
    tt.setTarget(target);
    return tt;
  }
}