# Array-Operations
//Insert at Beginning
#include<stdio.h>
int main()
{
  int a[100],i,size,item;
	printf("Enter Size of an Array: ");
	scanf("%d",&size);
	printf("Enter elements of an array: ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Array is given as: ");
	for(i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
	printf("Enter item to be inserted: ");
	scanf("%d",&item);
	size++;
	for(i=size;i>=0;i--)
	{
		a[i+1]=a[i];
	}
	a[0] = item;
	printf("Array after insertion is given as: ");
	for(i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
}


//Insert at end
#include<stdio.h>
int main()
{
  int a[100],i,size,item;
	printf("Enter Size of an Array: ");
	scanf("%d",&size);
	printf("Enter elements of an array: ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Array is given as: ");
	for(i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
	printf("Enter item to be inserted: ");
	scanf("%d",&item);
	size++;
	a[size-1] = item;
	for(i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
}


//Insert at given position
#include<stdio.h>
int main()
{
	int position,item,i,size,a[100];
	printf("Enter size of an array: ");
	scanf("%d",&size);
	printf("Enter elements of an array: ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
	printf("Enter item to be inserted: ");
	scanf("%d",&item);
	printf("Enter position of an item: ");
	scanf("%d",&position);
	for(i=size;i>=position;i--)
	{
		a[i] = a[i-1];
	}
	a[position] = item;
	size++;
	printf("Resultant array elements: ");
	for(i=0;i<size;i++)
	{
		printf("%d ",a[i]);
	}
}

//Menu Driven Program for Insertion Operation
#include<stdio.h>
void display(int a[],int size)
{
    for(int i=0;i<size;i++)
    {
        printf("%d ",a[i]);
    }
    printf("\n");
}
 
void insert_beg(int a[],int item,int size)
{
    printf("Enter item to be inserted: ");
    scanf("%d",&item);
    size++;
    for(int i=size;i>=0;i--)
    {
        a[i+1] = a[i];
    }
    a[0] = item;
}

int insert_end(int a[],int item,int size)
{
    printf("Enter item to be inserted: ");
    scanf("%d",&item);
    size++;
    a[size-1] = item;
    return size;
}

void insert_pos(int a[],int item,int pos,int size)
{
    printf("Enter item to be inserted: ");
    scanf("%d",&item);
    printf("Enter position of an item: ");
    scanf("%d",&pos);
    for(int i=size;i>=pos;i--)
    {
        a[i] = a[i-1];
    }
    a[pos] = item;
    size++;
}

int main()
{
    int choice,a[100],size,item,position;
    printf("Enter size of an array: ");
    scanf("%d",&size);
    printf("Enter elements of an array: ");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&a[i]);
    }
    while(choice!=5)
    {
        printf("1. Display\n");
        printf("2. Insert at beginning\n");
        printf("3. Insert at end\n");
        printf("4. Insert at specific position\n");
        printf("5. EXIT\n");
        printf("\nEnter choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            display(a,size);
            break;
            
            case 2:
            insert_beg(a,item,size);
            break;
            
            case 3:
            size = insert_end(a,item,size);
            break;
            
            case 4:
            insert_pos(a,item,position,size);
            break;
            
            case 5:
            printf("EXIT");
            break;
        }
    }
}
