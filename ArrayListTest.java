����   ; u  collections/ArrayListTest  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcollections/ArrayListTest; main ([Ljava/lang/String;)V  java/util/ArrayList
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;    java/util/List   add (Ljava/lang/Object;)Z    ! " get (I)Ljava/lang/Object;
  $ % & intValue ()I  ( ) & size	 + - , java/lang/System . / out Ljava/io/PrintStream; 1 java/lang/StringBuilder
 3 5 4 java/lang/String  6 (I)Ljava/lang/String;
 0 8  9 (Ljava/lang/String;)V ;  
 0 = > ? append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 0 A > B (I)Ljava/lang/StringBuilder;
 0 D E F toString ()Ljava/lang/String;
 H J I java/io/PrintStream K 9 println  M N O 	retainAll (Ljava/util/Collection;)Z
 H Q K R (Ljava/lang/Object;)V  T U V stream ()Ljava/util/stream/Stream; X Z Y java/util/stream/Stream [ V distinct
 ] _ ^ java/util/stream/Collectors ` a toList ()Ljava/util/stream/Collector; X c d e collect 0(Ljava/util/stream/Collector;)Ljava/lang/Object; args [Ljava/lang/String; list1 Ljava/util/List; list2 first I last list3 list4 newList LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; 
SourceFile ArrayListTest.java !               /     *� �    
                    	      -    '� Y� L+� �  W+
� �  W+� �  W� Y� M,� �  W,� �  W,
� �  W+�  � � #>++� ' d�  � � #6� *� 0Y� 2� 7:� <� @� C� G+,� L W� *+� P� Y� :� �  W� �  W� �  W� Y� :� �  W� �  W
� �  W� S � W � \� b � :� *� P�    
   b           +  3  >  J  V  d  z  �  �  �  �  �  �   � ! � " � # � $ ' )& +    R   ' f g    h i  3 � j i  d � k l  z � m l  � w n i  � H o i  	 p i  q   4   h r  3 � j r  � w n r  � H o r  	 p r   s    t