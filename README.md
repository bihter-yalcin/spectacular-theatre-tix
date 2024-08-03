# Spectacular-Theatre-Tix API
## Optimistic, or Pessimistic, that is the question  

![IMG_7192](https://github.com/user-attachments/assets/e32a8673-e7f0-4c61-bcc2-929b8963f245)

This theatre project uses both pessimistic and optimistic locking as a learning exercise to handle concurrency. Pessimistic locking is used in the bookTicket function to avoid issues when multiple users try to book the same seat at the same time, by locking the data until the booking is done.

For updating customer details like name or tier, optimistic locking is applied. This method doesn't lock the data immediately but checks for conflicts when trying to save changes, making it more efficient when conflicts are not expected to happen often.

By experimenting with both methods, this project aims to explore different ways to manage data consistency in real-world scenarios.
