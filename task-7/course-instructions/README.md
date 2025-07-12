# General instructions for exercises and assignments in INDA
This document contains general information and instructions for the weekly
exercises and assignments. Please read this document carefully.

## Courses concerned
* DD1337
* DD1338
* DD1396
* DD1349

If you take any of these courses, the instructions in this document apply to
you.

## Exercises
Most weeks, there will be a mandatory exercise, usually on Thursday or Friday.
These exercises are led by the course assistants, and barring any unforeseen
circumstances, you will have the same assistant throughout all of the INDA
courses. The following rules apply to all exercises throughout the INDA
courses:

1. Before the first exercise, you will be assigned to a group and receive an
   e-mail with time and place for your first exercise. If you have not received
   such an e-mail within a day or two of the first exercise, please send an
   e-mail to `glassey@kth.se` and ask for a group.
2. There are in general two separately scheduled exercises per week, sometimes
   on different days. You should only attend _one_ of these. Your assistant
   will provide a schedule for your specific group.
3. Attending the exercises is **mandatory**. If you are unable to attend, you
   must contact your assistant as soon as possible. Exceptions to attendance
   are made on a case by case basis, but assistants tend to be more
   understanding the earlier they are contacted.  Failure to attend the
   exercise without contacting your assistant beforehand will in general lead
   to a fail on that week's assignment.
4. You may be called upon to present a portion of the week's assignment during
   the exercise. This is not a life-or-death situation in which one incorrect
   answer will land you with a fail, and if you have done the tasks you should
   have few issues coming up with answers.

## Assignments
Each exercise has an associated assignment, which must be completed _before_
the exercise begins. The following rules apply to all assignments throughout
the INDA courses:

1. Every assignment has an associated repository on KTH GitHub. All of your
   course repositories can be found
   **[here](https://gits-15.sys.kth.se/inda-22)**.
2. **Submit your assignment in time!** The assignment should be **completed and
   pushed to KTH GitHub before the exercise begins**. If the exercise starts
   att 8.15 on Friday, then you can push until 8.14 on Friday. Exceptions to
   this rule are made in the same way as exceptions to exercise attendance (see
   point 3 under [Exercises](#exercises)).
3. To pass an assignment, you must attempt to complete all tasks as well as
   attend the exercise.  Minor errors are acceptable, and even completely
   failing at a task can be all right as long as it is not a recurring theme.
   **The most important thing is to make a valid attempt at each task!**
4. If your assistant finds that you have too many or too grave errors in your
   assignment, you will be issued _komplettering_ via an issue on KTH GitHub.
   The exact proceedings vary slightly between different assistants, but the
   following always applies:
    - You are not allowed to push any changes to the repository until your
      assistant has opened an issue.
    - From the opening of the **first** issue, you have 7 days to submit your
      fixes.
    - If your fixes are not satisfactory, you may be issued further
      komplettering, and the 7 day period from the opening of the first issue
      may or may not be slightly extended depending on how far off your
      solutions are.
5. If the name of a class or signature/header of a method is given in the
   exercise, **then you must use that!** For example, if the exercise tells you
   to create a method with the header `public String toString()`, then that is
   the exact header you should use (remember that **capitalization matters!**)
   The reason for this is to make correcting the assignments easier for the
   assistants.
6. **Assignments are individual work**. You are allowed to discuss the
   assignments with each other, but copying other peoples' work is absolutely
   forbidden.  Please read the **[Code of
   Honor](https://www.kth.se/eecs/utbildning/hederskodex/inledning-1.17237)** carefully.
    - If you sit in a group solving the assignments, do not look at each
      others' work. Once you see a solution to a problem, it can be very
      difficult to unsee it.
    - If you feel like you have worked too closely with someone for an
      assignment, make sure to make a note of this in the source code/question
      answers.
    - Every year, students are caught copying work from each other and from the
      internet.  Don't be one of those students!
7. And about the internet. Sometimes, you can find a really neat solution to
   some problem on there.  Sometimes, copying a snippet of code from the
   internet can be just fine and even appropriate, and sometimes it is not. It
   is difficult to give an exact definition of what is ok and what is not, but
   here are some general guidelines:
    - When copying anything at all, always leave a reference (like a link in a
      comment) to the source, and explicitly state that you did not author the
      copied portion yourself!
    - If it essentially solves the whole task, it is **not** ok to copy.
    - If you do not understand how the code works, it is **not** ok to copy.
    - If the code is from course litterature, it is in general **just fine** to
      copy.
    - Code for purely language related stuff, like how to read input from the
      command line, how to open a file, or how to add elements to a list, is in
      general **just fine** to copy.
    - When in doubt, ask your assistant!

### Preparation
The `Preparation` section is one of the two primary sections of the assignment.
Here you will find reading instructions and, occasionally, assignments to
complete.  **None of this should be pushed to your repository**, but you may be
quizzed on the contents during the exercise. It is in your own best interests
to do the homework properly, as you will have a much easier time with the
Github tasks as being properly prepared for the exercises.

### Github task
The second primary section is the `Github task` section. In here, you will find
all of the exercises you need to **complete and push to your repository on KTH
Github.** It is important that you **read the exercises in the repo**, even if
you have followed the book, as there can be extra information that you need to
know about (see the following subsection). The exercise numbers are given
mostly for context.

#### Assistant's notes and requirements
In some exercises, you will find a quote that starts with one of the two
following phrases:

* **Assistant's note:** These appear where we thought the exercise texts were
  not clear enough, or where there have been larger issues before.
* **Assistant's requirement:** These appear where, apart from what is written
  in the exercise text, you also need to do something else. This is most often
  a requirement to name a class or method in a specific way, to make correcting
  the assignments easier. Fulfilling the requirement is **not** optional, it is
  as much a part of the exercise as anything.

Here is an example of a requirement, so you know what to look for:

> **Assistant's requirement:** Exercises 4.31-4.33 must be submitted in a
> public class called `Loops` in a file called `Loops.java`.

### Submitting to KTH GitHub
This year, we've decided to try out video tutorials for the basics on KTH
GitHub. Almost all of this also applies to using git with `github.com`. You can
find the video playlist
[here](https://www.youtube.com/watch?v=Sp5AASmX4no&list=PLZtN6QLX2rBA_gL6zs-qijIDihx-p2tO8).

#### KTH GitHub service window
An important note that is not mentioned in the tutorials is the KTH GitHub
service window. Usually, KTH GitHub goes down for an hour or two starting from
16.00 on Thursday, so if you suddenly can't push, this is likely the reason.

### Getting help
Sometimes you will probably need some help, whether that be with an assignment
or figuring out where in the world room B22 is at. There are two ways to
receive assistance:

* The primary resource for receiving help with the assignments are the weekly
  labs, which should appear in your schedule. Go to one of these sessions and
  enter the **[queue](http://queue.csc.kth.se/Queue/INDA)**, and an assistant
  will be with you as soon as possible.  Remember to specify where you are so
  that the assistants can find you!
* Your assistant can also help you with all sorts of things. For example, if
  you have questions about the course in general, can't make it to the lab for
  help with an assignment or you are feeling lost overall, contact your
  assistant! He or she will either be able to help you directly, or point you
  in the right direction.

In case you feel like you have a problem that you cannot discuss with an
assistant, you may also contact the course responsible teacher Ric Glassey at
`glassey@kth.se`.

## Grade criteria
### DD1337
Graded A-F

* A - Pass all 9 assignments
* B - Pass 8 assignments
* C - Pass 7 assignments
* D - Pass 6 assignments
* E - Pass 5 assignments
* F - Pass 4 or less assignments

### DD1338
Same as for DD1337, with the added requirement that both parts of the Quicksort assignment
*must be completed* in order to pass the course.

### DD1396
Graded Pass/Fail

* P - Pass all 3 assignments
* F - Pass 2 or less assignments

### DD1349
This course is pass/fail and consists solely of a project, see the course site
for details.
