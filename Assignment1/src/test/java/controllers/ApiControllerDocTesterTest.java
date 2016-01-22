/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;
import resources.myCard;
import resources.deck;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
public class ApiControllerDocTesterTest extends NinjaDocTester {

    String URL_INDEX = "/";
    String URL_ACES_UP = "/AcesUp";

    @Test
    public void testGetIndex() {

        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_INDEX)));

        assertThat(response.payload, containsString("Hello World!"));
        assertThat(response.payload, containsString("BAM!"));
    }

    @Test
    public void testAcesUp() {
        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_ACES_UP)));

        assertThat(response.payload, containsString("Aces Up"));
        assertThat(response.payload, containsString("columnOfCards"));
    }
    @Test
    public void testCardCreation(){
        myCard Cardy;
        Cardy = new myCard();
        assert(Cardy.getRank() == ' ');
    }
    @Test
    public void testCardRankSettingGetting(){
        myCard Cardy;
        Cardy = new myCard();
        Cardy.setRank(3);
        assert(Cardy.getRank() == 3);
    }
    @Test
    public void testCardSuitSettingGetting(){
        myCard Cardy;
        Cardy = new myCard();
        Cardy.setSuit('H');
        assert(Cardy.getSuit() == 'H');
    }
    public void testCardConstructor(){
        myCard Cardy;
        Cardy = new myCard(3, 'H');
        assert(Cardy.getSuit() == 'H');
        assert(Cardy.getRank() == 3);
    }

    @Test
    public void testCardComparison(){
        myCard curCard;
        curCard = new myCard();
        myCard otherCard;
        otherCard = new myCard();


        curCard.setRank(13);
        assert(curCard.getRank() == 13);
        otherCard.setRank(12);
        assert(otherCard.getRank() == 12);
        if (curCard.compareRank(otherCard) == 3)
        {
            System.out.println("Error: something wrong with comparison");
        }

        //Test if current card rank greater than other card rank
        curCard.setRank(13);
        assert(curCard.getRank() == 13);
        otherCard.setRank(12);
        assert(otherCard.getRank() == 12);
        curCard.compareRank(otherCard);
        assert(curCard.compareRank(otherCard) == 2);

        //Test if current card rank equal to the other card rank
        curCard.setRank(13);
        assert(curCard.getRank() == 13);
        otherCard.setRank(13);
        assert(otherCard.getRank() == 13);
        curCard.compareRank(otherCard);
        assert(curCard.compareRank(otherCard) == 0);

        //Test if current card rank less than the other card rank
        curCard.setRank(11);
        assert(curCard.getRank() == 11);
        otherCard.setRank(12);
        assert(otherCard.getRank() == 12);
        curCard.compareRank(otherCard);
        assert(curCard.compareRank(otherCard) == 1);

        //Test if current card suit matches other card suit
        curCard.setSuit('D');
        assert(curCard.getSuit() == 'D');
        otherCard.setSuit('D');
        assert(otherCard.getSuit() == 'D');
        curCard.compareSuit(otherCard);
        assertTrue(curCard.compareSuit(otherCard));

        //Test if current card suit doesn't match other card suit
        curCard.setSuit('D');
        assert(curCard.getSuit() == 'D');
        otherCard.setSuit('H');
        assert(otherCard.getSuit() == 'H');
        curCard.compareSuit(otherCard);
        assertFalse(curCard.compareSuit(otherCard));

    }

    @Test
    public void testDeck(){
        deck myDeck = new deck();
        myDeck.cards[0] = new myCard(2,'c');
    }
    @Test
    public void testCardInDeckClubs(){
        deck myDeck = new deck();
        assertEquals(myDeck.cards[0].getRank(),1);
        assertEquals(myDeck.cards[0].getSuit(),'c');
        assertEquals(myDeck.cards[1].getRank(),2);
        assertEquals(myDeck.cards[0].getSuit(),'c');
        for(int i = 0; i<13; i++){
            assertEquals(myDeck.cards[i].getRank(),i+1);
            assertEquals(myDeck.cards[i].getSuit(),'c');
        }
    }
    @Test
    public void testCardAndRankSpades(){
        deck myDeck = new deck();
        int myRank = 1;
        for(int i = 13; i<26; i++){
            assertEquals(myDeck.cards[i].getRank(),myRank);
            assertEquals(myDeck.cards[i].getSuit(),'s');
            myRank ++;
        }
    }

    @Test
    public void testCardAndRankHearts(){
        deck myDeck = new deck();
        int myRank = 1;
        for(int i = 26; i<39; i++){
            assertEquals(myDeck.cards[i].getRank(),myRank);
            assertEquals(myDeck.cards[i].getSuit(),'h');
            myRank ++;
        }
    }

    @Test
    public void testCardAndRankDiamonds(){
        deck myDeck = new deck();
        int myRank = 1;
        for(int i = 39; i<52; i++){
            assertEquals(myDeck.cards[i].getRank(),myRank);
            assertEquals(myDeck.cards[i].getSuit(),'d');
            myRank ++;
        }
    }
}

