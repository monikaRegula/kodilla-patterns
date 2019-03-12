package com.kodilla.patterns.singleton;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TaskList;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString(){
        //given
        //creating TaskLists:
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n-> n+1)
                .limit(10)
                .forEach(n-> listToDo.getTasks().add(new Task("To Do Task number "+ n)));
        TaskList listInProgress = new TaskList("In Progress");
        IntStream.iterate(1,n-> n+1)
                .limit(10)
                .forEach(n-> listInProgress.getTasks().add(new Task("In Progress Task number "+n)));
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1, n-> n+1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("DOne Task Number "+n)));
        //creating board to assing tasklists:
        Board board = new Board("Project1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow clone of object oard
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep clone of board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard  = board.deepCopy();
            deepClonedBoard.setName("Project3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //when
        board.getLists().remove(listToDo);
        //then
         System.out.println(board);
         System.out.println(clonedBoard);
         System.out.println(deepClonedBoard);
        Assert.assertEquals(2,board.getLists().size());
        Assert.assertEquals(2,clonedBoard.getLists().size());
        Assert.assertEquals(3,deepClonedBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(),board.getLists());
        Assert.assertNotEquals(deepClonedBoard.getLists(),board.getLists());
    }


}
